package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.Appointment;


public class AppointmentController {
    private static List<Appointment> appointments = new ArrayList<>();
    private static int nextId = 1;

    public Appointment marcarConsulta(int usuarioId, int profissionalId, 
                                       LocalDateTime dataHora, 
                                       String tipoConsulta, String observacoes) {
        Appointment newAppointment = new Appointment(
            nextId++, usuarioId, profissionalId, dataHora, tipoConsulta, observacoes
        );
        appointments.add(newAppointment);
        return newAppointment;
    }

    public List<Appointment> listarConsultas(int usuarioId) {
        return appointments.stream()
            .filter(a -> a.getUsuarioId() == usuarioId)
            .collect(Collectors.toList());
    }
    
    public Appointment editarConsulta(int consultaId, 
            LocalDateTime novaDataHora, 
            String novoTipoConsulta, String novasObservacoes){
        for(Appointment consulta: appointments){
            if(consulta.getId() == consultaId){
                consulta.setDataHora(novaDataHora);
                consulta.setTipoConsulta(novoTipoConsulta);
                consulta.setObservacao(novasObservacoes);
                return consulta;
            }
        }
        throw new IllegalArgumentException("Consulta não encontrada");
    }
    
    public boolean excluirConsulta(int consultaId){
        return appointments.removeIf(a -> a.getId() == consultaId);
    }
    
}
