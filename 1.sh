dir_or_file=$1"/"$element
if [ -d $dir_or_file ]
then
    if [ $element = "build" ] # �ж��ļ�������build
    then
        echo "$dir_or_file" # ����ļ���·��
        rm -rfv $dir_or_file # ɾ���ļ���
    else
        readDir $dir_or_file # �����ļ���
    fi
fi 