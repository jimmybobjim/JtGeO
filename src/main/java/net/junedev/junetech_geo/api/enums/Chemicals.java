package net.junedev.junetech_geo.api.enums;

import net.junedev.junetech_geo.api.interfaces.IMaterialHandler;
import net.minecraftforge.fluids.FluidType;

import java.util.*;

public class Chemicals {
        public static final List<IMaterialHandler> mMaterialHandlers = new ArrayList<>();
        private static final Map<String, net.junedev.junetech_geo.api.enums.Chemicals> CHEMICALS_MAP = new LinkedHashMap<>();

        public static final Map<FluidType, net.junedev.junetech_geo.api.enums.Chemicals> FLUID_MAP = new LinkedHashMap<>();


        public static Collection<net.junedev.junetech_geo.api.enums.Materials> VALUES = new LinkedHashSet<>();
        //sets defaults... might not need this?
        public static net.junedev.junetech_geo.api.enums.Chemicals _NULL = new net.junedev.junetech_geo.api.enums.Chemicals(-1, "NULL", "NULL", "NULL", 0, 0, 0, 0, "NULL", 255, false, 0, "NULL", 0);

        public Chemicals(int chemicalID, String name, String IUPACName, String formula, int pH, double meltingPoint, double boilingPoint, int meltsInto, String colorName, int transparency, boolean solubility, int dissolvesInto, String mineralAssociate, int enthalpyOfFormation) {
        }

//        public Radioisotopes(int chemicalID, String chemicalName, String decayType, String decayProduct, double halfLife) {
//        }

        //Raw Elements
        public static void load() {
                loadElements();
                loadChemicals();
                loadMinerals();
                loadIons();
                loadIsotopes();
        }

        private static void loadIsotopes() {
//                Chemicals.Deuterium = loadDeuterium();
//                Chemicals.Helium3 = loadHelium3();
        }

        private static void loadIons() {
        }

        private static void loadElements() {
//                Chemicals.Hydrogen = loadHydrogen();
//                Chemicals.Helium = loadHelium();
//                Chemicals.Lithium = loadLithium();
//                Chemicals.Beryllium = loadBeryllium();
//                Chemicals.Boron = loadBoron();
//                Chemicals.Carbon = loadCarbon();
//                Chemicals.Nitrogen = loadNitrogen();
//                Chemicals.Oxygen = loadOxygen();
//                Chemicals.Fluorine = loadFluorine();
//                Chemicals.Neon = loadNeon();
//                Chemicals.Sodium = loadSodium();
//                Chemicals.Magnesium = loadMagnesium();
//                Chemicals.Aluminium = loadAluminium();
//                Chemicals.Silicon = loadSilicon();
//                Chemicals.Phosphorus = loadPhosphorus();
//                Chemicals.Sulfur = loadSulfur();
//                Chemicals.Chlorine = loadChlorine();
//                Chemicals.Argon = loadArgon();
//                Chemicals.Potassium = loadPotassium();
//                Chemicals.Calcium = loadCalcium();
//                Chemicals.Scandium = loadScandium();
//                Chemicals.Titanium = loadTitanium();
//                Chemicals.Vanadium = loadVanadium();
//                Chemicals.Chromium = loadChromium();
//                Chemicals.Manganese = loadManganese();
//                Chemicals.Iron = loadIron();
//                Chemicals.Cobalt = loadCobalt();
//                Chemicals.Nickel = loadNickel();
//                Chemicals.Copper = loadCopper();
//                Chemicals.Zinc = loadZinc();
//                Chemicals.Gallium = loadGallium();
//                Chemicals.Germanium = loadGermanium();
//                Chemicals.Arsenic = loadArsenic();
//                Chemicals.Selenium = loadSelenium();
//                Chemicals.Bromine = loadBromine();
//                Chemicals.Krypton = loadKrypton();
//                Chemicals.Rubidium = loadRubidium();
//                Chemicals.Strontium = loadStrontium();
//                Chemicals.Yttrium = loadYttrium();
//                Chemicals.Zirconium = loadZirconium();
//                Chemicals.Niobium = loadNiobium();
//                Chemicals.Molybdenum = loadMolybdenum();
//                Chemicals.Technetium = loadTechnetium();
//                Chemicals.Ruthenium = loadRuthenium();
//                Chemicals.Rhodium = loadRhodium();
//                Chemicals.Palladium = loadPalladium();
//                Chemicals.Silver = loadSilver();
//                Chemicals.Cadmium = loadCadmium();
//                Chemicals.Indium = loadIndium();
//                Chemicals.Tin = loadTin();
//                Chemicals.Antimony = loadAntimony();
//                Chemicals.Tellurium = loadTellurium();
//                Chemicals.Iodine = loadIodine();
//                Chemicals.Xenon = loadXenon();
//                Chemicals.Caesium = loadCaesium();
//                Chemicals.Barium = loadBarium();
//                Chemicals.Lanthanum = loadLanthanum();
//                Chemicals.Cerium = loadCerium();
//                Chemicals.Praseodymium = loadPraseodymium();
//                Chemicals.Samarium = loadSamarium();
//                Chemicals.Europium = loadEuropium();
//                Chemicals.Gadolinium = loadGadolinium();
//                Chemicals.Terbium = loadTerbium();
//                Chemicals.Dysprosium = loadDysprosium();
//                Chemicals.Holmium = loadHolmium();
//                Chemicals.Erbium = loadErbium();
//                Chemicals.Thulium = loadThulium();
//                Chemicals.Ytterbium = loadYtterbium();
//                Chemicals.Lutetium = loadLutetium();
//                Chemicals.Hafnium = loadHafnium();
//                Chemicals.Tantalum = loadTantalum();
//                Chemicals.Tungsten = loadTungsten();
//                Chemicals.Rhenium = loadRhenium();
//                Chemicals.Osmium = loadOsmium();
//                Chemicals.Iridium = loadIridium();
//                Chemicals.Platinum = loadPlatinum();
//                Chemicals.Gold = loadGold();
//                Chemicals.Mercury = loadMercury();
//                Chemicals.Thallium = loadThallium();
//                Chemicals.Lead = loadLead();
//                Chemicals.Bismuth = loadBismuth();
//                Chemicals.Polonium = loadPolonium();
//                Chemicals.Astatine = loadAstatine();
//                Chemicals.Radon = loadRadon();
//                Chemicals.Francium = loadFrancium();
//                Chemicals.Radium = loadRadium();
//                Chemicals.Actinium = loadActinium();
//                Chemicals.Thorium = loadThorium();
//                Chemicals.Protactinium = loadProtactinium();
//                Chemicals.Uranium = loadUranium();

        }

        private static Chemicals loadHydrogen(){
                return new Chemicals(1,
                        "Dihydrogen", "Hydrogen", "H₂", 0, -259.16, -25287, 0, "PaleBlue", 50, true, 1, "Null", 0);

        }

        private static void loadChemicals() {
        }

        private static void loadMinerals() {
        }


}
