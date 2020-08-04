package it.digifox03.variedmobs.api;

import it.digifox03.variedmobs.core.SelectorRegistryImpl;
import net.minecraft.util.Identifier;

import java.lang.reflect.Type;

public interface SelectorRegistry {
    static SelectorRegistry getInstance() {
        return SelectorRegistryImpl.INSTANCE;
    }
    void register(Identifier id, Type selector);
}
