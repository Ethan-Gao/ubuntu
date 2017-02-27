TARGETS = mountkernfs.sh hostname.sh procps mountdevsubfs.sh urandom hwclock.sh mountall-bootclean.sh mountall.sh bootmisc.sh checkfs.sh checkroot.sh mountnfs-bootclean.sh mountnfs.sh checkroot-bootclean.sh
INTERACTIVE = checkfs.sh checkroot.sh
procps: mountkernfs.sh
mountdevsubfs.sh: mountkernfs.sh
urandom: hwclock.sh
hwclock.sh: mountdevsubfs.sh
mountall-bootclean.sh: mountall.sh
mountall.sh: checkfs.sh checkroot-bootclean.sh
bootmisc.sh: mountall-bootclean.sh mountnfs-bootclean.sh checkroot-bootclean.sh
checkfs.sh: checkroot.sh
checkroot.sh: mountdevsubfs.sh hostname.sh hwclock.sh
mountnfs-bootclean.sh: mountnfs.sh
checkroot-bootclean.sh: checkroot.sh
