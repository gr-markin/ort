/*
 * Copyright (C) 2017-2019 HERE Europe B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
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

package com.here.ort.spdx

/**
 * An enum containing all SPDX license exception IDs. This class is generated by the Gradle task
 * 'generateSpdxLicenseExceptionEnum'.
 */
@Suppress("EnumNaming")
enum class SpdxLicenseException(
    /**
     * The id of the license exception.
     */
    val id: String,

    /**
     * Whether the [id] is deprecated or not.
     */
    val deprecated: Boolean = false
) {
    /** Autoconf exception 2.0 */
    AUTOCONF_EXCEPTION_2_0("Autoconf-exception-2.0"),
    /** Autoconf exception 3.0 */
    AUTOCONF_EXCEPTION_3_0("Autoconf-exception-3.0"),
    /** Bison exception 2.2 */
    BISON_EXCEPTION_2_2("Bison-exception-2.2"),
    /** Bootloader Distribution Exception */
    BOOTLOADER_EXCEPTION("Bootloader-exception"),
    /** Classpath exception 2.0 */
    CLASSPATH_EXCEPTION_2_0("Classpath-exception-2.0"),
    /** CLISP exception 2.0 */
    CLISP_EXCEPTION_2_0("CLISP-exception-2.0"),
    /** DigiRule FOSS License Exception */
    DIGIRULE_FOSS_EXCEPTION("DigiRule-FOSS-exception"),
    /** eCos exception 2.0 */
    ECOS_EXCEPTION_2_0("eCos-exception-2.0"),
    /** Fawkes Runtime Exception */
    FAWKES_RUNTIME_EXCEPTION("Fawkes-Runtime-exception"),
    /** FLTK exception */
    FLTK_EXCEPTION("FLTK-exception"),
    /** Font exception 2.0 */
    FONT_EXCEPTION_2_0("Font-exception-2.0"),
    /** FreeRTOS Exception 2.0 */
    FREERTOS_EXCEPTION_2_0("freertos-exception-2.0"),
    /** GCC Runtime Library exception 2.0 */
    GCC_EXCEPTION_2_0("GCC-exception-2.0"),
    /** GCC Runtime Library exception 3.1 */
    GCC_EXCEPTION_3_1("GCC-exception-3.1"),
    /** GNU JavaMail exception */
    GNU_JAVAMAIL_EXCEPTION("gnu-javamail-exception"),
    /** GPL Cooperation Commitment 1.0 */
    GPL_CC_1_0("GPL-CC-1.0"),
    /** i2p GPL+Java Exception */
    I2P_GPL_JAVA_EXCEPTION("i2p-gpl-java-exception"),
    /** Libtool Exception */
    LIBTOOL_EXCEPTION("Libtool-exception"),
    /** Linux Syscall Note */
    LINUX_SYSCALL_NOTE("Linux-syscall-note"),
    /** LLVM Exception */
    LLVM_EXCEPTION("LLVM-exception"),
    /** LZMA exception */
    LZMA_EXCEPTION("LZMA-exception"),
    /** Macros and Inline Functions Exception */
    MIF_EXCEPTION("mif-exception"),
    /** Nokia Qt LGPL exception 1.1 */
    NOKIA_QT_EXCEPTION_1_1("Nokia-Qt-exception-1.1", true),
    /** OCaml LGPL Linking Exception */
    OCAML_LGPL_LINKING_EXCEPTION("OCaml-LGPL-linking-exception"),
    /** Open CASCADE Exception 1.0 */
    OCCT_EXCEPTION_1_0("OCCT-exception-1.0"),
    /** OpenJDK Assembly exception 1.0 */
    OPENJDK_ASSEMBLY_EXCEPTION_1_0("OpenJDK-assembly-exception-1.0"),
    /** OpenVPN OpenSSL Exception */
    OPENVPN_OPENSSL_EXCEPTION("openvpn-openssl-exception"),
    /** PS/PDF font exception (2017-08-17) */
    PS_OR_PDF_FONT_EXCEPTION_20170817("PS-or-PDF-font-exception-20170817"),
    /** Qt GPL exception 1.0 */
    QT_GPL_EXCEPTION_1_0("Qt-GPL-exception-1.0"),
    /** Qt LGPL exception 1.1 */
    QT_LGPL_EXCEPTION_1_1("Qt-LGPL-exception-1.1"),
    /** Qwt exception 1.0 */
    QWT_EXCEPTION_1_0("Qwt-exception-1.0"),
    /** Swift Exception */
    SWIFT_EXCEPTION("Swift-exception"),
    /** Universal FOSS Exception, Version 1.0 */
    UNIVERSAL_FOSS_EXCEPTION_1_0("Universal-FOSS-exception-1.0"),
    /** U-Boot exception 2.0 */
    U_BOOT_EXCEPTION_2_0("u-boot-exception-2.0"),
    /** WxWindows Library Exception 3.1 */
    WXWINDOWS_EXCEPTION_3_1("WxWindows-exception-3.1"),
    /** 389 Directory Server Exception */
    _389_EXCEPTION("389-exception");

    companion object {
        /**
         * Return the enum value for the given [id], or null if it is no SPDX license exception id.
         */
        fun forId(id: String) = values().find { it.id.equals(id, true) }
    }

    /**
     * The full license exception text as a string.
     */
    val text by lazy { javaClass.getResource("/exceptions/$id").readText() }
}
