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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HP-PERU
 */
@Data
@Entity
@Table(name = "producto") 
public class Producto implements Serializable {
 @Id
    @Column(name = "pro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proId;
    
    @Column(name="pro_nombre")
    private String proName;
    
    @Column(name ="pro_precio")
    private String proPrecio;
    
    @Column(name="pro_marca")
    private String proMarca;
    
    @Column(name="pro_codigo")
    private String ProCodigo;

@ManyToOne
@JoinColumn (name = "catg_id")
private Categoria categoria;
}
