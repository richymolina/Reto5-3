/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import com.example.demo.Modelo.Tool;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ricar
 */
public interface ToolInterface extends CrudRepository<Tool,Integer> {
    
}
