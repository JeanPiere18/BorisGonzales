/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BGonzales.demo.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HP-PERU
 */
@Data
@Entity
@Table(name = "categoria") 
public class Categoria implements Serializable {
     @Id
    @Column(name = "catg_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long catgId;
    
    @Column(name="catg_nombre")
    private String catgName;
    
    @Column(name ="catg_descripcion")
    private String catgDescripcion;
    
    @Column(name="catg_encargado")
    private String catgEncargado;
     
}
