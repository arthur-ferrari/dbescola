package psii.senai.dbescola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import psii.senai.dbescola.model.Aluno;
import psii.senai.dbescola.repository.AlunoRepository;

@Controller
public class AlunoController {

    private final AlunoRepository repository;

    public AlunoController(AlunoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/alunos")
    public String index(Model model) {
        model.addAttribute("alunos", repository.findAll());
        model.addAttribute("aluno", new Aluno());
        return "alunos";
    }
    @GetMapping("/")
    public String home() {
        return "redirect:/alunos";
    }    
    @PostMapping("/alunos/salvar")
    public String salvar(@ModelAttribute Aluno aluno) {
        repository.save(aluno);
        return "redirect:/alunos";
    }
}
