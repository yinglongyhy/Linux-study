# 杨宏宇 - Git入门

> 这个世界没有技术难题！

---

## Git命令总结

> 请使用自己的语言描述每一条命令的作用。

| 命令                                                         | 作用                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| git config --global user.name "Your Name"<br />git config --global user.email "email@example.com" | 设置全局参数用户名和邮箱                                     |
| git init [路径]                                              | 初始化仓库，路径为空默认为当前目录                           |
| git add [file]<br />git rm [file]                            | 添加工作区文件到暂存区<br />把删除文件操作添加到暂存区       |
| git commit<br />git commit -m [message]                      | 把暂存区文件提交到本地仓库<br />提交并输入提交说明           |
| git status                                                   | 查看仓库当前状态                                             |
| git diff [file]                                              | 查看文件所做的修改                                           |
| git log<br />git log --graph                                 | 查看提交历史<br />查看分支合并图                             |
| git reset --hard [commit_id]<br />git reset HEAD [file]      | 回退到指定版本<br />把暂存区的修改撤销掉，重新放回工作区     |
| git reflog                                                   | 查看操作历史                                                 |
| git checkout -- file<br />git checkout [name]<br />git checkout -b [name]<br />git checkout -b branch-name origin/branch-name | 丢弃工作区指定文件的修改<br />切换到指定分支<br />创建并切换到指定分支<br />在本地创建和远程分支对应的分支 |
| ssh-keygen -t rsa -C "youremail@example.com"                 | 生成ssh秘钥                                                  |
| git remote -v<br />git remote add origin git@github.com: server-name:path/repo-name.git | 查看远程库信息<br />把本地已有仓库与远程仓库关联             |
| git push origin [name]<br />git push -u origin [name]<br />git push origin [tagname]<br />git push origin --tags<br />git push origin :refs/tags/[tagname] | 推送分支到远程仓库<br />第一次推送分支到远程仓库<br />推送本地标签<br />推送全部未推送过的本地标签<br />删除一个远程标签 |
| git clone git@github.com: server-name:path/repo-name.git<br />git clone https://github.com/server-name/reop-name.git | 从远程仓库克隆到本地仓库                                     |
| git branch<br />git branch [name]<br />git branch -d [name]<br />git branch -D [name]<br />git branch --set-upstream branch-name origin/branch-name | 查看分支<br />创建分支<br />删除已合并分支<br />强制删除分支<br />建立本地分支和远程分支的关联 |
| git merge [name]<br />git merge --no-ff [name]               | 合并某分支到当前分支<br />合并某分支并生成新的提交           |
| git stash<br />git stash list<br />git stash apply<br />git stash drop<br />git stash pop | 保存工作进度<br />查看已保存进度列表<br />恢复进度(没在进度列表删除)<br />删除进度列表的进度<br />恢复进度(并从进度列表删除) |
| git pull                                                     | 取回远程主机某个分支的更新，<br />再与本地的指定分支合并     |
| git rebase                                                   | 把本地未push的分叉提交历史整理成直线                         |
| git tag [tagname]<br />git tag -a [tagname] -m "say something"<br />git tag<br />git tag -d [tagname] | 新建标签<br />新建标签并指定标签信息<br />查看所有标签<br />删除标签 |

---

## 项目源码

```java
package com.scau;

import java.util.Scanner;

public class findChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String pattern = input.next();

        for (int i = 0; i < pattern.length(); i++) {
            int count = 1;
            char ch = pattern.charAt(i);
            i++;
            while (count < n && i < pattern.length()) {
                if (ch == pattern.charAt(i)) {
                    i++;
                    count++;
                } else {
                    i--;
                    break;
                }
            }
            if (count >= n) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("No");
    }
}
```

---

**源码网址** : https://github.com/yinglongyhy/Linux-study/tree/master/Java-2/src/com/scau

------

## 项目测试截图

![](/home/yinglongyhy/workspace/Linux-study/Java-2/test-photo/test-1.png)

![](/home/yinglongyhy/workspace/Linux-study/Java-2/test-photo/test-2.png)

![](/home/yinglongyhy/workspace/Linux-study/Java-2/test-photo/test-3.png)

---

## 遇到的问题以及如何解决

- #### 学习版本操作时思路混乱

  按照教程自己多操作几遍，填表格总结，加深理解

---

