DESCRIPTION = "Expedite is a comprehensive benchmarking suite for Evas"
DEPENDS = "eet evas"
LICENSE = "MIT BSD"

SRCREV = "${EFL_SRCREV}"
PV = "1.1.0+svnr${SRCPV}"
PR = "r1"

inherit e
SRC_URI = "${E_SVN}/trunk;module=${SRCNAME};proto=http;scmdata=keep"
S = "${WORKDIR}/${SRCNAME}"

EXTRA_OECONF = "\
  --x-includes=${STAGING_INCDIR}/X11 \
  --x-libraries=${STAGING_LIBDIR} \
  --enable-simple-x11 \
\
  --disable-opengl-glew \
  --enable-software-x11 \
  --enable-xrender-x11 \
  --enable-software-16-x11 \
  --enable-opengl-x11 \
  --enable-fb \
  --disable-software-ddraw \
  --disable-software-16-ddraw \
  --disable-direct3d \
  --disable-software-sdl \
"

FILES_${PN} += "${datadir}"
RDEPENDS_${PN} = "expedite-themes evas-engine-fb evas-engine-software-generic evas-engine-software-x11 evas-engine-gl-x11 evas-loader-png"
