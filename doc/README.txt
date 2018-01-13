


二、本地代码已成功，如何推到远程仓库上
-删除远程仓库，如果该仓库存在（选中setting - delete...）
-新建远程仓库 Repositories - New （不选任何初始化信息）
{
cd E:/WorkSpaces/IdeaProjects/yx_ssm
git remote -v #无值
检查本地写好的代码 mvn clean，清除target文件夹
git init
git add .
git status
git commit -m "初始化项目"
git remote -v
git remote add origin https://github.com/whinsist/yx_ssm
git remote -v #有值
git push origin master   #把master分支推送到origin上去，再刷新网页
}