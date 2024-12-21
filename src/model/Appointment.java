package model;

import java.time.LocalDateTime;


public class Appointment {
    private int id;
    private int usuarioId;
    private int profissionalId;
    private LocalDateTime dataHora;
    private String tipoConsulta;
    private String observacao;
    
    public Appointment(int id, int usuarioId, int profissionalId, 
            LocalDateTime dataHora, String tipoConsulta, String observacao){
        this.id = id;
        this.usuarioId = usuarioId;
        this.profissionalId = profissionalId;
        this.dataHora = dataHora;
        this.tipoConsulta = tipoConsulta;
        this.observacao = observacao;
    }
    
    public int getId(){ return id; }
    public void setID(int id){ this.id = id; }
    
    public int getUsuarioId(){ return usuarioId; }
    public void setUsuarioId(int usuarioId){ this.usuarioId = usuarioId; }
    
    public int getProfissionalId(){ return profissionalId; }
    public void setProfissionalId(int profissionalId){ this.profissionalId = profissionalId; }
    
    public LocalDateTime getDataHora(){ return dataHora; }
    public void setDataHora(LocalDateTime dataHora){ this.dataHora = dataHora; }
    
    public String getTipoConsulta(){ return tipoConsulta; }
    public void setTipoConsulta(String tipoConsulta){ this.tipoConsulta = tipoConsulta; }
    
    public String getObservacao(){ return observacao; }
    public void setObservacao(String observacao){ this.observacao = observacao; }
}
