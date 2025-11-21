package net.junedev.junetech_geo.api.materials;

import net.junedev.junetech_geo.api.interfaces.IColorify;
import net.junedev.junetech_geo.api.interfaces.ISubTagContainer;
import net.junedev.junetech_geo.api.interfaces.IMaterialHandler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import net.minecraftforge.fluids.FluidType;


public class Materials implements IColorify, ISubTagContainer {
    public static final List<IMaterialHandler> mMaterialHandlers = new ArrayList<>();
    private static final Map<String, Materials> MATERIALS_MAP = new LinkedHashMap<>();

    public static final Map<FluidType, Materials> FLUID_MAP = new LinkedHashMap<>();


    public static Collection<Materials> VALUES = new LinkedHashSet<>();
    //sets defaults... might not need this?
    public static Materials _NULL = new Materials(-1, "NULL", "NULL", "NULL", "NULL", 0, "NULL", 255, 0, 255, 0, "NULL", -1, "NULL", "NULL");

    public final short[] mRGBa = new short[] { 255, 255, 255, 0 }, mMoltenRGBa = new short[] { 255, 255, 255, 0 };

    public Materials(int materialID, String name, String localName, String associatedBlock, String formula, int hardness, String crystalHabit, int r, int g, int b, int a, String luster, int rarity, String group, String customCondition) {
    }

    /*
    Important Oxides
     */
    public static Materials Silica;
    public static Materials Alumina;
    public static Materials IronIIOxide;
    public static Materials IronIIIOxide;
    public static Materials Magnesia;
    public static Materials Quicklime;
    public static Materials ManganeseOxide;
    public static Materials TitaniumDioxide;
    public static Materials PotassiumOxide;
    public static Materials SodiumOxide;
    public static Materials PhosphorusPentoxide;
    public static Materials Water;
    public static Materials VanadiumVOxide;
    public static Materials ChromiumIIIOxide;

    /*
    Rock Forming Minerals/Metamorphic Series Minerals: the main ones
     */

    public static Materials Plagioclase;
    public static Materials Quartz;
    public static Materials Calcite;
    public static Materials Dolomite;
    public static Materials AlkaliFeldspar;
    public static Materials Garnet;
    public static Materials Olivine;
    public static Materials Pyroxene;
    public static Materials Orthopyroxene;
    public static Materials Clinopyroxene;
    public static Materials Amphibole;
    public static Materials Hornblende;
    public static Materials Muscovite;
    public static Materials Biotite;
    public static Materials Sodalite;
    public static Materials Epidote;
    public static Materials Chlorite;
    public static Materials Kyanite;
    public static Materials Sillimanite;
    public static Materials Halite;
    public static Materials Gypsum;
    public static Materials Chalcedony;
    public static Materials Spinel;
    public static Materials Talc;
    public static Materials Prehnite;
    public static Materials Pumpellyite;

    /*
    T1 Ore minerals and the like
     */

    public static Materials Pyrite;
    public static Materials Chalcopyrite;
    public static Materials Hematite;
    public static Materials Magnesite;
    public static Materials Magnetite;
    public static Materials BandedIron;
    public static Materials Galena;
    public static Materials Sphalerite;
    public static Materials Malachite;
    public static Materials Chromite;
    public static Materials Cassiterite;
    public static Materials Gibbsite;
    public static Materials Stibnite;
    public static Materials Diamond;
    public static Materials Baryte;
    public static Materials Beryl;
    public static Materials Emerald;
    public static Materials Borax;
    public static Materials Cobaltite;
    public static Materials Zircon;
    public static Materials Spodumene;
    public static Materials Lepidolite;
    public static Materials Rhodochrosite;
    public static Materials Cinnabar;
    public static Materials Molybdenite;
    public static Materials Pyrochlore;
    public static Materials Apatite;
    public static Materials Sperrylite;
    public static Materials Sylvite;
    public static Materials Pollucite;
    public static Materials Acanthite;
    public static Materials Tantalite;
    public static Materials Monazite;
    public static Materials Rutile;
    public static Materials Ilmenite;
    public static Materials Scheelite;
    public static Materials Uraninite;
    public static Materials MagnetiteVanadium;
    public static Materials Graphite;
    public static Materials Zeolite;
    public static Materials Gadolinite;
    public static Materials Pentlandite;
    public static Materials Cerussite;

    /*
    Gemstones and quartz types
     */

    public static Materials Alexandrite;
    public static Materials Corundum;
    public static Materials Ruby;
    public static Materials Sapphire;
    public static Materials Padparadscha;
    public static Materials Fluorite;
    public static Materials Moissanite;
    public static Materials Tourmaline;
    public static Materials Amethyst;
    public static Materials Citrine;
    public static Materials Ametrine;
    public static Materials Aventurine;
    public static Materials Flint;
    public static Materials HerkimerDiamond;
    public static Materials Prasiolite;
    public static Materials RoseQuartz;
    public static Materials SmokyQuartz;
    public static Materials Jadeite;
    //Garnets
    public static Materials Pyralspite; //Red Garnet
    public static Materials Almandine;
    public static Materials Pyrope;
    public static Materials Spessartine;
    public static Materials Ugrandite; //Yellow Garnet
    public static Materials Andradite;
    public static Materials Demantoid;
    public static Materials Melanite;
    public static Materials Topazolite;
    public static Materials Grossular;
    public static Materials Hessonite;
    public static Materials Hydrogrossular;
    public static Materials Tsavorite;
    public static Materials Uvarovite;
    public static Materials Aquamarine; //Beryls
    public static Materials EmeraldTrapiche;
    public static Materials Heliodor;
    public static Materials RedBeryl;
    public static Materials Chrysoberyl;
    public static Materials Lazurite;
    public static Materials Azurite;
    public static Materials Opal;
    public static Materials Peridot;
    public static Materials Chrysocolla;
    public static Materials Topaz;
    public static Materials Chrysotile;
    public static Materials Asbestos;

    

    @Override
    public short[] getRGBa() {
        return new short[0];
    }

    @Override
    public boolean contains(SubTag aTag) {
        return false;
    }

    @Override
    public ISubTagContainer add(SubTag... aTags) {
        return null;
    }

    @Override
    public boolean remove(SubTag aTag) {
        return false;
    }
}