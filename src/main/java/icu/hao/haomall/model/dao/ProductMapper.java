package icu.hao.haomall.model.dao;

import icu.hao.haomall.model.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hao_mall_product
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hao_mall_product
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    int insert(Product row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hao_mall_product
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    int insertSelective(Product row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hao_mall_product
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hao_mall_product
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    int updateByPrimaryKeySelective(Product row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hao_mall_product
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    int updateByPrimaryKey(Product row);
    Product selectByName(String name);
    int batchUpdateSellStatus(@Param("ids") Integer[] ids, @Param("sellStatus") Integer sellStatus);
    List<Product> selectList();
}