SRC_URI[aarch64.md5sum] = "99c76c569b9941d7b39749981c6d167e"
SRC_URI[aarch64.sha256sum] = "9f72686de941e3cc73f61574174c0373d7b8a1d51526174a428bfe49253d0662"

require enigma2-bin-4.3.inc

SRC_URI += " file://0001-AVSwitch.py-let-getOutputAspect-function-always-retu.patch"
