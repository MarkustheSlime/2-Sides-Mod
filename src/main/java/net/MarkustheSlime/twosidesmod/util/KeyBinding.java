package net.MarkustheSlime.twosidesmod.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {

    public static final String KEY_CATEGORY_TWO_SIDES = "key.category.twosidesmod.tutorial";
    public static final String TK1 = "key.twosidesmod.tk1";

    public static final KeyMapping TK1_KEY = new KeyMapping(TK1, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_R, KEY_CATEGORY_TWO_SIDES);

    public static final String TK2 = "key.twosidesmod.tk2";

    public static final KeyMapping TK2_KEY = new KeyMapping(TK2, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_T, KEY_CATEGORY_TWO_SIDES);

    public static final String TK3 = "key.twosidesmod.tk3";

    public static final KeyMapping TK3_KEY = new KeyMapping(TK3, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_Y, KEY_CATEGORY_TWO_SIDES);

    public static final String TK4 = "key.twosidesmod.tk4";

    public static final KeyMapping TK4_KEY = new KeyMapping(TK4, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_U, KEY_CATEGORY_TWO_SIDES);

    public static final String TK5 = "key.twosidesmod.tk5";

    public static final KeyMapping TK5_KEY = new KeyMapping(TK5, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_I, KEY_CATEGORY_TWO_SIDES);

    public static final String MARKERC = "key.twosidesmod.markerc";

    public static final KeyMapping MARKERC_KEY = new KeyMapping(MARKERC, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, KEY_CATEGORY_TWO_SIDES);
}
