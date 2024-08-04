package app.controller;

import app.service.BibliotecaService;
import entity.Biblioteca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/biblioteca")
public class BibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;


    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Biblioteca biblioteca){
        try {
            String mensagem = this.bibliotecaService.save(biblioteca);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Deu erro!"+e.getMessage(), HttpStatus.BAD_REQUEST );
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@RequestBody Biblioteca biblioteca, @PathVariable long id){
        try {
            String mensagem = this.bibliotecaService.update(biblioteca, id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Deu erro!"+e.getMessage(), HttpStatus.BAD_REQUEST );
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Biblioteca> findById(@PathVariable long id){
        try {
            Biblioteca biblioteca = this.bibliotecaService.findById(id);
            return new ResponseEntity<>(biblioteca, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
        }
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Biblioteca>> findAll(){
        try {
            List<Biblioteca> lista = this.bibliotecaService.findAll();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id){
        try {
            String mensagem = this.bibliotecaService.delete(id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
        }
    }
}
