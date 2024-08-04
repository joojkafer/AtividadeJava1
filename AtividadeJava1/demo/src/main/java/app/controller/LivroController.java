package app.controller;

import app.service.LivroService;
import entity.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;


    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Livro livro){
        try {
            String mensagem = this.livroService.save(livro);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Deu erro!"+e.getMessage(), HttpStatus.BAD_REQUEST );
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@RequestBody Livro livro, @PathVariable long id){
        try {
            String mensagem = this.livroService.update(livro, id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Deu erro!"+e.getMessage(), HttpStatus.BAD_REQUEST );
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Livro> findById(@PathVariable long id){
        try {
            Livro livro = this.livroService.findById(id);
            return new ResponseEntity<>(livro, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
        }
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Livro>> findAll(){
        try {
            List<Livro> lista = this.livroService.findAll();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id){
        try {
            String mensagem = this.livroService.delete(id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
        }
    }
}
