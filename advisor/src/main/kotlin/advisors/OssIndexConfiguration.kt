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

package org.ossreviewtoolkit.advisor.advisors

/**
 * The configuration for the OSS Index provider.
 */
data class OssIndexConfiguration(
    /**
     * The base URL of the OSS Index REST API. If undefined, default base URL for the REST API of the public OSS Index
     * service.
     */
    val serverUrl: String? = null,

    /**
     * The username to use for authentication. If not both [username] and [password] are provided, authentication is
     * disabled.
     */
    val username: String? = null,

    /**
     * The password to use for authentication. If not both [username] and [password] are provided, authentication is
     * disabled.
     */
    val password: String? = null
)
