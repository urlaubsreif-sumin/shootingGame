package com.example.shootinggame;

/**
 * Board에서 Bullet과 Enemy의 충돌을 감지하여 MainActivity로 알려주기 위한 Listener
 */
public interface ConflictListener {
    public void conflict(Enemy e, Bullet b);
}
