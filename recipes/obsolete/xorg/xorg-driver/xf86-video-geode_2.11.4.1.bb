require xorg-driver-video.inc
DESCRIPTION = "X.org server -- Geode GX2/LX display driver"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI += "file://fixes.patch"
SRC_URI[archive.md5sum] = "05f85d897ef41d13de354ac0252bf923"
SRC_URI[archive.sha256sum] = "d739f6762fe3aa7ef7ca74f87fbe4d6ec3bb13a735e5dfb82b6748eda2b31138"

COMPATIBLE_HOST = "i.86.*-linux"
