
package rj.upeu.modelo;

/**
 *
 * @author @JONATAN
 */

public class MwUsuarioTo {
    String UsuarioId,Alias,Clave,FechaAlta,FechaAcceso,Estado,EstadoSession;

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEstadoSession() {
        return EstadoSession;
    }

    public void setEstadoSession(String EstadoSession) {
        this.EstadoSession = EstadoSession;
    }

    public String getFechaAcceso() {
        return FechaAcceso;
    }

    public void setFechaAcceso(String FechaAcceso) {
        this.FechaAcceso = FechaAcceso;
    }

    public String getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(String FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    public String getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(String UsuarioId) {
        this.UsuarioId = UsuarioId;
    }
}
