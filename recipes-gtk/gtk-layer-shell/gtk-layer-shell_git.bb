SUMMARY = "A library to write GTK applications that use Layer Shell"
DESCRIPTION = "A library to write GTK applications that use Layer Shell. Layer Shell is a Wayland protocol for desktop shell components, such as panels, notifications and wallpapers."
AUTHOR = ""
HOMEPAGE = "https://github.com/wmww/gtk-layer-shell"
BUGTRACKER = "https://github.com/www/gtk-layer-shell/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE_MIT.txt;md5=d015f272ca1521139fd99ea64d6e5e23"

REQUIRED_DISTRO_FEATURES = "wayland gobject-introspection-data"

DEPENDS += " \
	gtk+3 \
	wayland \
	wayland-native \
	gobject-introspection \
	gobject-introspection-native \
	qemu-native \
	prelink-native \
"

SRC_URI = "git://github.com/wmww/gtk-layer-shell.git;protocol=https"

S = "${WORKDIR}/git"
PV = "0.6.0"
SRCREV = "v${PV}"

inherit meson pkgconfig features_check
FILES:${PN} = "${datadir} ${libdir}"

BBCLASSEXTEND = ""

