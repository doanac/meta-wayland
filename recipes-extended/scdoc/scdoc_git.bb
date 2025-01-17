SUMMARY = "scdoc is a simple man page generator for POSIX systems written in C99."
HOMEPAGE = "https://github.com/ddevault/scdoc"
BUGTRACKER = "https://github.com/ddevault/scdoc/issues"
SECTION = "base/doc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=31752b4a8edd3fb9ddba1cb90fada74d"

SRC_URI = " \
	git://github.com/ddevault/scdoc.git;protocol=https \
"

DEPENDS = "scdoc-native"

S = "${WORKDIR}/git"
PV = "1.11.0"
SRCREV = "${PV}"

EXTRA_OEMAKE:class-native = "PREFIX=${prefix}"
EXTRA_OEMAKE:class-target = "PREFIX=${prefix} HOST_SCDOC=${STAGING_BINDIR_NATIVE}/scdoc"

inherit autotools-brokensep
	
BBCLASSEXTEND = "native"

