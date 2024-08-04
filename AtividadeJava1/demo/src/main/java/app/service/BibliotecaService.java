package app.service;

import entity.Biblioteca;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BibliotecaService {

    public String save (Biblioteca biblioteca) {
        return "Biblioteca cadastrado com sucesso";
    }

    public String update (Biblioteca biblioteca, long id) {
        return "Atualizado com sucesso";
    }

    public Biblioteca findById (long id) {

        List<Biblioteca> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i);
            }
        }

        return null;

    }

    public List<Biblioteca> findAll () {

        List<Biblioteca> lista = new ArrayList<>();
        lista.add(new Biblioteca(1,"Foz do Iguacu 1", "9 99999999"));
        lista.add(new Biblioteca(2,"Foz do Iguacu 2", "9 99999999"));
        lista.add(new Biblioteca(3,"Foz do Iguacu 3", "9 99999999"));
        lista.add(new Biblioteca(4,"Foz do Iguacu 4", "9 99999999"));

        return lista;
    }

    public String delete (long id) {

        List<Biblioteca> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i).getTelefone()+" deletado com sucesso";
            }
        }
        return "Biblioteca não encontrado";
    }
}
