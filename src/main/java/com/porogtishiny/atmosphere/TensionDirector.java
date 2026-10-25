package com.porogtishiny.atmosphere;

/**
 * Режиссёр напряжения (заглушка): хранит фазу и считает тики.
 * Позже запускает атмосферные сигналы (тишина, шёпот, тени) по фазе.
 */
public class TensionDirector {
    private TensionPhase phase = TensionPhase.CALM;
    private int ticksInPhase = 0;

    public void tick() {
        ticksInPhase++;
        // TODO: правила переходов между фазами и запуск событий
    }

    public void setPhase(TensionPhase next) {
        this.phase = next;
        this.ticksInPhase = 0;
    }

    public TensionPhase phase() { return phase; }
    public int ticksInPhase() { return ticksInPhase; }
}
