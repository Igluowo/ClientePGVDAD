/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto.clienteproyectopgv;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import static oshi.util.FormatUtil.formatBytes;

/**
 * FXML Controller class
 *
 * @author erick
 */
public class PantallaClienteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        CentralProcessor cpu = hal.getProcessor();
        List<HWDiskStore> diskStores = hal.getDiskStores();
        for (HWDiskStore diskStore : diskStores) {
            System.out.println("Disk Name: " + diskStore.getName());
            System.out.println("Total Space: " + formatBytes(diskStore.getSize()));
            System.out.println("Available Space: " + formatBytes(diskStore.getWriteBytes()));
        }
        System.out.println(cpu.getMaxFreq());
        System.out.println(hal.getMemory().getTotal());
    }

}
