require xorg-lib-common.inc
DESCRIPTION = "X11 Session management library"
DEPENDS += "libice xproto xtrans util-linux-ng"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "05a04c2b6382fb0054f6c70494e22733"
SRC_URI[archive.sha256sum] = "7536ac382e1ff82014d3a0defba0c61b3a30984f4e5bc7707960d6debcb92a82"

BBCLASSEXTEND = "native"

XORG_PN = "libSM"
