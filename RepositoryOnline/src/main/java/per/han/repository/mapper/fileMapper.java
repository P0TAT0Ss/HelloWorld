package per.han.repository.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import per.han.repository.VO.IFile;
import per.han.repository.VO.User;

import java.util.List;

public interface fileMapper {
    @Insert(value = "INSERT INTO files" +
            "(name, type, size, stream, create_at, uploader) " +
            "VALUES " +
            "(#{it.name},#{it.type},#{it.size},#{it.stream},now(),#{it.uploader})")
    int insert() throws Exception;

    @Delete(value = "DELETE" +
            "FROM files" +
            "WHERE name = #{name}")
    int delete(String name) throws Exception;

    @Update(value = "UPDATE files " +
            "SET name = #{name} " +
            "WHERE id = #{id}")
    int update(IFile IFile) throws Exception;

    @Select(value = "SELECT name,type,size,uploader,create_at " +
            "FROM files " +
            "WHERE name LIKE \"%\"#{name}\"%\"")
    List<IFile> queryByName(String name) throws Exception;

    @Select(value = "SELECT name, type, size, uploader, create_at" +
            "FROM files " +
            "WHERE uploader LIKE \"%\"#{uploader}\"%\"")
    List<IFile> queryByUploader(String uploader) throws Exception;

    @Select(value = "SELECT name, type, size, uploader, create_at" +
            "FROM files")
    List<IFile> queryAll() throws Exception;
}
