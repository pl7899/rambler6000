SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://../LICENSE;md5=1ab252f869ddacc2b737c1b5041f3014"

FILESEXTRAPATHS:prepend := "${THISDIR}/:"
FILES:${PN} += "/home/root /home/root/install /Floppy /home/root/install/monitor.sh /home/root/install/newDrive.sh /home/root/install/startup.sh"

SRC_URI += " file://monitor.sh file://newDrive.sh file://startup.sh"

do_install(){
    install -d ${D}/home/root/install
    install -d ${D}/Floppy
    install -m 0755 ${WORKDIR}/monitor.sh ${D}${base_prefix}/home/root/install
    install -m 0755 ${WORKDIR}/newDrive.sh ${D}${base_prefix}/home/root/install
    install -m 0755 ${WORKDIR}/startup.sh ${D}${base_prefix}/home/root/install
}
