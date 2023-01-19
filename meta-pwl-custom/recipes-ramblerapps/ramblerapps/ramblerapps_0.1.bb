SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://../LICENSE;md5=1ab252f869ddacc2b737c1b5041f3014"

FILESEXTRAPATHS:prepend := "${THISDIR}/:"
FILES:${PN} += "/home/root /home/root/install /home/root/install/apps /home/root/install/apps/trucky /home/root/install/apps/vanagawesome /home/root/install/apps/trucky/trucky.sh /home/root/install/apps/vanagawesome/vanagawesome.sh"

SRC_URI += " file://trucky.sh file://vanagawesome.sh "

do_install(){
    install -d ${D}/home/root/install/apps/
    install -d ${D}/home/root/install/apps/trucky
    install -d ${D}/home/root/install/apps/vanagawesome
    install -m 0755 ${WORKDIR}/trucky.sh ${D}${base_prefix}/home/root/install/apps/trucky/autorun.sh
    install -m 0755 ${WORKDIR}/vanagawesome.sh ${D}${base_prefix}/home/root/install/apps/vanagawesome/autorun.sh
}
