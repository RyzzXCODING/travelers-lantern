package io.github.profetgit.travelerslantern.mixin.client;

//? if >=1.21.12 {
import io.github.profetgit.travelerslantern.demo.Director;
import net.minecraft.client.Camera;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Dev demo only: a follow camera beside the player (inert unless -Dtravelers_lantern.demo). */
@Mixin(Camera.class)
public abstract class CameraMixin {
    @Shadow
    private Entity entity;

    @Shadow
    protected abstract void setPosition(double x, double y, double z);

    @Shadow
    protected abstract void setRotation(float yRot, float xRot);

    @Inject(method = "alignWithEntity", at = @At("TAIL"))
    private void travelerslantern$demoCam(float partial, CallbackInfo ci) {
        if (!Director.ACTIVE || entity == null) return;
        double[] c = Director.camera(entity, partial);
        if (c == null) return;
        setPosition(c[0], c[1], c[2]);
        setRotation((float) c[3], (float) c[4]);
    }
}
//?}
//? if >=1.21.11 <1.21.12 {
import io.github.profetgit.travelerslantern.demo.Director;
import net.minecraft.client.Camera;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Dev demo only: a follow camera beside the player (inert unless -Dtravelers_lantern.demo). */
@Mixin(Camera.class)
public abstract class CameraMixin {
    @Shadow
    private Entity entity;

    @Shadow
    protected abstract void setPosition(double x, double y, double z);

    @Shadow
    protected abstract void setRotation(float yRot, float xRot);

    @Inject(method = "setup(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;ZZF)V", at = @At("TAIL"))
    private void travelerslantern$demoCam(Level level, Entity camEntity, boolean detached, boolean thirdPerson, float partial, CallbackInfo ci) {
        if (!Director.ACTIVE || entity == null) return;
        double[] c = Director.camera(entity, partial);
        if (c == null) return;
        setPosition(c[0], c[1], c[2]);
        setRotation((float) c[3], (float) c[4]);
    }
}
//?}
//? if >=1.21.2 <1.21.11 {
import io.github.profetgit.travelerslantern.demo.Director;
import net.minecraft.client.Camera;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Dev demo only: a follow camera beside the player (inert unless -Dtravelers_lantern.demo). */
@Mixin(Camera.class)
public abstract class CameraMixin {
    @Shadow
    private Entity entity;

    @Shadow
    protected abstract void setPosition(double x, double y, double z);

    @Shadow
    protected abstract void setRotation(float yRot, float xRot);

    @Inject(method = "alignWithEntity(F)V", at = @At("TAIL"))
    private void travelerslantern$demoCam(float partial, CallbackInfo ci) {
        if (!Director.ACTIVE || entity == null) return;
        double[] c = Director.camera(entity, partial);
        if (c == null) return;
        setPosition(c[0], c[1], c[2]);
        setRotation((float) c[3], (float) c[4]);
    }
}
//?}
//? if <1.21.2 {
import io.github.profetgit.travelerslantern.demo.Director;
import net.minecraft.client.Camera;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Dev demo only: a follow camera beside the player (inert unless -Dtravelers_lantern.demo). */
@Mixin(Camera.class)
public abstract class CameraMixin {
    @Shadow
    private Entity entity;

    @Shadow
    protected abstract void setPosition(double x, double y, double z);

    @Shadow
    protected abstract void setRotation(float yRot, float xRot);

    @Inject(method = "alignWithEntity", at = @At("TAIL"))
    private void travelerslantern$demoCam(float partial, CallbackInfo ci) {
        if (!Director.ACTIVE || entity == null) return;
        double[] c = Director.camera(entity, partial);
        if (c == null) return;
        setPosition(c[0], c[1], c[2]);
        setRotation((float) c[3], (float) c[4]);
    }
}
//?}