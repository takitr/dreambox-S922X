SUMMARY = "Dreambox TPM Daemon"
PR = "r5"

SRC_URI[mips32el.md5sum] = "36218ca3eff5bd0bcb13055026e50d63"
SRC_URI[mips32el.sha256sum] = "969438a72ca7c473903516e845cefe52313c01b4de5692bf2fa613a7814a1a84"
SRC_URI[mips32el-nf.md5sum] = "52ef082a5e2291a53204a1cbdfc0ff5a"
SRC_URI[mips32el-nf.sha256sum] = "4cd699cb9e97cb8cf66053c3c89945b00d8e40184d776232b9251a2350b0d277"

inherit opendreambox-precompiled-binary opendreambox-sysvinit

do_install() {
        install -d ${D}${bindir}
        install -m 0755 tpmd ${D}${bindir}
}

RDEPENDS_${PN} = "dreambox-compat wdog"

INITSCRIPT_PARAMS = "start 60 S ."
