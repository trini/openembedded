require xorg-driver-video.inc
DEPENDS += " xineramaproto xf86miscproto drm xf86driproto"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "99322cbcc9081ad44e9cba63e3df8f7e"
SRC_URI[archive.sha256sum] = "edae155c82d348b76dabe1373605bf6715b577cdd7a95f8b54ad534dc47c71ff"
