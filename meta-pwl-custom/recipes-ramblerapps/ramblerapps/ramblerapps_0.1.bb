SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://../LICENSE;md5=1ab252f869ddacc2b737c1b5041f3014"

FILESEXTRAPATHS:prepend := "${THISDIR}/:"
FILES:${PN} += "/home/root /home/root/install /home/root/install/apps /home/root/install/apps/trucky /home/root/install/apps/vanagawesome /home/root/install/apps/directions/ /home/root/install/apps/trucky/autorun.sh /home/root/install/apps/vanagawesome/autorun.sh /home/root/install/apps/directions/autorun.sh"

SRC_URI += " file://trucky.sh file://vanagawesome.sh file://directions.sh "

do_install(){
    install -d ${D}/home/root/install/apps/
    install -d ${D}/home/root/install/apps/trucky
    install -d ${D}/home/root/install/apps/vanagawesome
    install -d ${D}/home/root/install/apps/directions
    install -m 0755 ${WORKDIR}/trucky.sh ${D}${base_prefix}/home/root/install/apps/trucky/autorun.sh
    install -m 0755 ${WORKDIR}/vanagawesome.sh ${D}${base_prefix}/home/root/install/apps/vanagawesome/autorun.sh
    install -m 0755 ${WORKDIR}/directions.sh ${D}${base_prefix}/home/root/install/apps/directions/autorun.sh
}
