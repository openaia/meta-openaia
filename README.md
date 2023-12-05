# meta-openaia

Build instruction for OpenAIA Yocto/OE image in docker container.

## Clone source

```
$ mkdir yocto-openaia && cd yocto-openaia
$ git clone git@github.com:openaia/meta-openaia.git && cd -
```

## Build OpenAIA

Install the [docker](https://docs.docker.com/engine/install/ubuntu/) at host.

Build OpenAIA for 6TOPS,
```
$ docker run -ti --privileged --net host -v `pwd`:/home/build/shared -w /home/build/shared ghcr.io/openaia/easy-build/build-yocto-ubuntu:20.04 kas build meta-openaia/6tops-5.10.yml  
```

## Program

We can program microSD or eMMC, assume /dev/sdX is microSD detected in host,
```
cd tmp-glibc/deploy/images/\<MACHINE\>
sudo bmaptool copy --bmap core-image-full-cmdline-neu6b.wic.bmap core-image-full-cmdline-neu6b.wic.xz /dev/sdX
```
