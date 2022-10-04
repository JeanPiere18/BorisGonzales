/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BGonzales.demo.Impl;

import BGonzales.demo.Entity.Producto;
import BGonzales.demo.Repository.ProductoRepository;
import BGonzales.demo.Service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP-PERU
 */
@Service
public class ProductoServiceImpl implements ProductoService {
   @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void delete(Producto producto) {
        productoRepository.delete(producto);
    }

    @Override
    public void deleteById(Long id) {
        productoRepository.deleteById(id);   
 }     
}
