/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BGonzales.demo.Repository;

import BGonzales.demo.Entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP-PERU
 */
@Repository
public interface ProductoRepository extends CrudRepository< Producto, Long> {
    
}
