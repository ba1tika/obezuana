package com.example.obezuana.Controllers;

import com.example.obezuana.Models.*;
import com.example.obezuana.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.lang.Number;
import java.util.*;
import java.util.List;


@Controller
public class MainController {
    enum name {Breakfast, Bron, Clients, Employee, Number, NumberCategory, NumberSos, Post}
    @Autowired
    private BreakfastRepositories breakfast;
    @Autowired
    private BronRepositories bron;
    @Autowired
    private ClientsRepositories clients;
    @Autowired
    private EmployeeRepositories employee;
    @Autowired
    private NumberRepositories number;
    @Autowired
    private NumberCategoryRepositories numberCategory;
    @Autowired
    private NumberSosRepositories numberSos;
    @Autowired
    private PostRepositories post;
    public List Selet(name tab){
        switch (tab){
            case Breakfast -> {
                return (List) breakfast.findAll();
            }
            case Bron -> {
                return (List) bron.findAll();
            }
            case Clients -> {
                return (List) clients.findAll();
            }
            case Employee -> {
                return (List) employee.findAll();
            }
            case Number -> {
                return (List) number.findAll();
            }
            case NumberCategory -> {
                return (List) numberCategory.findAll();
            }
            case NumberSos -> {
                return (List) numberSos.findAll();
            }
            case Post -> {
                return (List) post.findAll();
            }
        }
        return null;
    }
    public List Delete(name tab, ArrayList arrayList){
        switch (tab){
            case Breakfast -> {
                breakfast.deleteById((Integer) arrayList.get(0));
                return (List) breakfast.findAll();
            }
            case  Bron -> {
                bron.deleteById((Integer) arrayList.get(0));
                return (List) bron.findAll();
            }
            case Clients -> {
                clients.deleteById((Integer) arrayList.get(0));
                return (List) clients.findAll();
            }
            case Employee -> {
                employee.deleteById((Integer) arrayList.get(0));
                return (List) employee.findAll();
            }
            case Number -> {
                number.deleteById((Integer) arrayList.get(0));
                return (List) number.findAll();
            }
            case NumberCategory -> {
                numberCategory.deleteById((Integer) arrayList.get(0));
                return (List) numberCategory.findAll();
            }
            case NumberSos -> {
                numberSos.deleteById((Integer) arrayList.get(0));
                return (List) numberSos.findAll();
            }
            case Post -> {
                post.deleteById((Integer) arrayList.get(0));
                return (List) post.findAll();
            }
        }
        return null;
    }
    public List Insert( name tab, ArrayList arrayList){
        switch (tab){
            case Breakfast -> {
                Breakfast br = (Breakfast) arrayList.get(0);
                breakfast.save(br);
                return (List) breakfast.findAll();
            }
            case Bron -> {
                Bron br = (Bron) arrayList.get(0);
                bron.save(br);
                return (List) bron.findAll();
            }
            case Clients -> {
                Clients cl = (Clients) arrayList.get(0);
                clients.save(cl);
                return (List) clients.findAll();
            }
            case Employee -> {
                Employee emp = (Employee) arrayList.get(0);
                employee.save(emp);
                return (List) employee.findAll();
            }
            case Number -> {
                Number num = (Number) arrayList.get(0);
                number.save(num);
                return (List) number.findAll();
            }
            case NumberCategory -> {
                NumberCategory numc = (NumberCategory) arrayList.get(0);
                numberCategory.save(numc);
                return (List) numberCategory.findAll();
            }
            case NumberSos -> {
                NumberSos nums = (NumberSos) arrayList.get(0);
                numberSos.save(nums);
                return (List) numberSos.findAll();
            }
            case Post -> {
                Post po = (Post) arrayList.get(0);
                post.save(po);
                return (List) post.findAll();
            }
        }
        return null;
    }
    public List Update( name tab, ArrayList arrayList){
        switch (tab){
            case Breakfast -> {
                Breakfast br = (Breakfast) arrayList.get(1);
                br.setIdBreakfast((Integer) arrayList.get(0));
                breakfast.save(br);
                return (List) breakfast.findAll();
            }
            case Bron -> {
                Bron br = (Bron) arrayList.get(1);
                br.setIdBron((Integer) arrayList.get(0));
                bron.save(br);
                return (List) bron.findAll();
            }
            case Clients -> {
                Clients cl = (Clients) arrayList.get(0);
                cl.setIdClients((Integer) arrayList.get(0));
                clients.save(cl);
                return (List) clients.findAll();
            }
            case Employee -> {
                Employee emp = (Employee) arrayList.get(0);
                emp.setIdEmployee((Integer) arrayList.get(0));
                employee.save(emp);
                return (List) employee.findAll();
            }
            case Number -> {
                Number num = (Number) arrayList.get(0);
                number.save(num);
                return (List) number.findAll();
            }
            case NumberCategory -> {
                NumberCategory numc = (NumberCategory) arrayList.get(0);
                numc.setIdNumberCategory((Integer) arrayList.get(0));
                numberCategory.save(numc);
                return (List) numberCategory.findAll();
            }
            case NumberSos -> {
                NumberSos nums = (NumberSos) arrayList.get(0);
                nums.setIdNumberSos((Integer) arrayList.get(0));
                numberSos.save(nums);
                return (List) numberSos.findAll();
            }
            case Post -> {
                Post po = (Post) arrayList.get(0);
                po.setIdPost((Integer) arrayList.get(0));
                post.save(po);
                return (List) post.findAll();
            }
        }
        return null;
    }
}
