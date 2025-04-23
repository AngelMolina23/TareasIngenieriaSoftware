package cmx.unam.aragon.ico.autos_api.servicios;

import cmx.unam.aragon.ico.autos_api.modelos.Automovil;
import cmx.unam.aragon.ico.autos_api.repositorios.AutomovilRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutomovilServiceImpl implements AutomovilService{
    @Autowired
    private AutomovilRepositoy automovilRepositoy;

    @Override
    public List<Automovil> getAutomovil() {
        return automovilRepositoy.findAll();
    }
}

