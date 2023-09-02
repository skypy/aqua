# aqua

## Download jdk17
https://www.oracle.com/java/technologies/downloads/#jdk17-linux

```
$ tar -xvzf /tmp/openjdk-17.0.1_linux-x64_bin.tar.gz
$ sudo cp -r /tmp/<jdk17-*> /usr/lib/jvm/
$ mkdir /opt/jdk
$ cd /opt/jdk
$ ln -s /usr/lib/jvm/jdk-17.0.8 jdk17
```

## install gradle
sudo mkdir /opt/gradle \
  && sudo chown $(id -u):$(id -g) /opt/gradle \
  && cd /tmp/ \
  && wget https://services.gradle.org/distributions/gradle-7.2-bin.zip  \
  && unzip -d /opt/gradle gradle-7.2-bin.zip