PR = "${INC_PR}.1"
require gcc-${PV}.inc
require gcc-cross4.inc

SRC_URI_append_fail-fast = " file://zecke-no-host-includes.patch "

EXTRA_OECONF += "  --enable-cheaders=c_std --disable-libunwind-exceptions --with-mpfr=${STAGING_DIR_NATIVE}${prefix_native}"

ARCH_FLAGS_FOR_TARGET += "-isystem${STAGING_DIR_TARGET}${target_includedir}"

