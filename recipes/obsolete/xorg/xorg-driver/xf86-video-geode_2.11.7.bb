require xorg-driver-video.inc
DESCRIPTION = "X.org server -- Geode GX2/LX display driver"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "086daecd062835eea51e2a718761dda3"
SRC_URI[archive.sha256sum] = "ed864a37b44dabb760f0b7caac8a796e3b1a0a7f305b44c4684f871b273a9f9b"

COMPATIBLE_HOST = "i.86.*-linux"
