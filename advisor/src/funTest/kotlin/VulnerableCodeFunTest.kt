/*
 * Copyright (C) 2023 The ORT Project Authors (see <https://github.com/oss-review-toolkit/ort/blob/main/NOTICE>)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * License-Filename: LICENSE
 */

package org.ossreviewtoolkit.advisor

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.shouldBe

import org.ossreviewtoolkit.advisor.advisors.VulnerableCode
import org.ossreviewtoolkit.advisor.advisors.VulnerableCodeConfiguration
import org.ossreviewtoolkit.model.Identifier
import org.ossreviewtoolkit.model.Package
import org.ossreviewtoolkit.model.utils.toPurl
import org.ossreviewtoolkit.utils.test.shouldNotBeNull

class VulnerableCodeFunTest : StringSpec({
    // Enter an API key to enable the test.
    val apiKey = ""

    "Findings should be returned for a vulnerable package".config(enabledIf = { apiKey.isNotEmpty() }) {
        val vc = VulnerableCode("VulnerableCode", VulnerableCodeConfiguration(apiKey = apiKey))
        val id = Identifier("Maven:com.google.guava:guava:19.0")
        val pkg = Package.EMPTY.copy(id, purl = id.toPurl())

        val findings = vc.retrievePackageFindings(setOf(pkg))

        with(findings.values.flatMap { it.vulnerabilities }.associateBy { it.id }) {
            keys shouldContainAll setOf(
                "CVE-2018-10237",
                "CVE-2020-8908",
                "CVE-2023-2976"
            )

            getValue("CVE-2023-2976").references.find {
                it.url.toString() == "https://nvd.nist.gov/vuln/detail/CVE-2023-2976"
            } shouldNotBeNull {
                severity shouldBe "7.1"
                severityRating shouldBe "HIGH"
            }
        }
    }
})
