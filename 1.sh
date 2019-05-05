dir_or_file=$1"/"$element
if [ -d $dir_or_file ]
then
    if [ $element = "build" ] # 判断文件夹名是build
    then
        echo "$dir_or_file" # 输出文件夹路径
        rm -rfv $dir_or_file # 删除文件夹
    else
        readDir $dir_or_file # 遍历文件夹
    fi
fi 