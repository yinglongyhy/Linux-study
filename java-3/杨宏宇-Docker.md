# 姓名 - Docker

## Docker的截图

1. 镜像列表

![](/home/yinglongyhy/workspace/Linux-study/java-3/docker-image.png)

2. 访问网站后的截图

![](/home/yinglongyhy/workspace/Linux-study/java-3/page.png)

---

## 小游戏 

1. 小游戏源码

```java
// 下面放源码
package com.scau;

import java.util.Scanner;

public class guessNum {

    public static void main(String[] args) {
        int num = (int)(Math.random() * 1000);
//        System.out.println(num);

        int i = 1;
        int guess = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("第" + i + "次");
            System.out.println("请输入0-1000的整数");
            guess = input.nextInt();
            if (num == guess) {
                System.out.println("猜中了，随机数为" + num);
                break;
            } else if (num > guess) {
                System.out.println("偏小");
            } else {
                System.out.println("偏大");
            }
            i++;
        }
    }
}
```

2. 截图

![](/home/yinglongyhy/workspace/Linux-study/java-3/guessNumber.png)

---

## 遇到的问题以及如何解决

- #### apache服务无法启动

  搜索发现，centos7在docker里启动后台服务会出错，而`docker pull centos`默认下载centos7，使用`docker rmi <Image ID> `删除centos7，并用`docker pull centos:6`指定下载的centos版本，启动apache成功。

- #### 默认镜像缺少必要的软件，每次从默认镜像启动容器操作不方便

  在默认容器配置好web服务器环境后，退出docker。使用`docker container ls -a`查看刚才运行的容器，用`docker commit <CONTAINER ID> <new Image-Name>`把容器保存为新的镜像。

- #### 关于端口映射和挂载宿主机的问题

  - **下面是例子：**

    `docker run -it --rm -p 80:80 -v ~/workspace/yinglongyhy.github.io:/var/www/html <Image ID> zsh`

  - **分析**

    `docker run`从指定镜像（<Image ID>）中新建并运行一个容器

    `-it`是`-i -t`， `-i` 选项让容器的标准输入保持打开，`-t` 则让Docker分配一个伪终端（pseudo-tty）并绑定到容器的标准输入上

    `--rm`选项表示当用户退出容器后，容器自动销毁

    `-p 80:8080`: 指定端口映射，格式为：主机(宿主)端口:容器端口

    `-v ~/workspace/yinglongyhy.github.io:/var/www/html`选项表示把宿主机的`~/workspace/yinglongyhy.github.io`目录挂载到容器的`/var/www/html`目录

    `zsh`当镜像里安装了**zsh**时，可以直接用zsh进入容器终端，若没安装，可以改为`bash`

    