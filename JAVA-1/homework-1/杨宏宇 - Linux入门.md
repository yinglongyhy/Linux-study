# 杨宏宇 - Linux入门

> 愿每次写报告都有新的收获，知识或者思想。

------

## Manjaro图形界面截图

> 由于装的不是Ubuntu，而是Manjaro，所以附上Manjaro截图
>



![](/home/yinglongyhy/workspace/Linux-study/JAVA-1/homework-1/作业-桌面截图.png)

------

## IDEA打开项目后截图

![](/home/yinglongyhy/workspace/Linux-study/JAVA-1/homework-1/作业-intellij idea截图.png)

------

## 命令history截图

![](/home/yinglongyhy/workspace/Linux-study/JAVA-1/homework-1/作业-history.png)

------

## 遇到的困难以及如何解决的

- #### 安装完系统后，系统没有自带中文输入法

  ###### 查看arch wiki和网上的博客，有详细的教程

  1. 用文本编辑器打开**/etc/pacman.conf**，末尾添加以下两句：

     `[archlinuxcn]` 

     `Server = https://mirrors.ustc.edu.cn/archlinuxcn/$arch`

     或者进入[这里](https://github.com/archlinuxcn/mirrorlist-repo)挑一个镜像加速源

  2. 执行`sudo pacman-mirrors -i -c China -m rank`勾选两到三个较快的源

  3. `sudo pacman -Syu && sudo pacman -S archlinuxcn-keyring`更新系统并导入GPG key

  4. 安装以下几个软件包

     `sudo pacman -S fcitx`

     `sudo pacman -S fcitx-configtool`

     `sudo pacman -S fcitx-im`

     `sudo pacman -S fcitx-sogoupinyin`

     其中**fcitx-im**直接回车，默认选中全部

  5. 用文本编辑器打开**~/xprofile**，在其末尾添加一下几行

     `export GTK_IM_MODULE=fcitx` 

     export QT_IM_MODULE=fcitx 

     `export XMODIFIERS="@im=fcitx"`

  6. 最后重启桌面系统

- #### 不熟悉shadowsocks的配置

  查看arch wiki 有详细介绍，点[这里](https://wiki.archlinux.org/index.php/Shadowsocks_(%E7%AE%80%E4%BD%93%E4%B8%AD%E6%96%87)#.E5.91.BD.E4.BB.A4.E8.A1.8C)

- #### 系统没有自带触摸板手势，使用触摸板不方便

  还是查看arch wiki 和博客，点[这里](https://wiki.archlinux.org/index.php/Libinput)

  ------

  ### 总结

  有问题多看wiki和博客

