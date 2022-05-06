package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {
        Character character;
        Character character2;

        @Before
        public void setUp() {
            character = new Character("Thanos",75,100,50,
                    30, 10,true, false);
            character2 = new Constable("John",70,100,50,
                    30, 5,false, false, true);
        }

        @Test
        public void shouldThisCharacterBeRunning() {
            character.isRunning();
            assertEquals(true, character);
        }
        @Test
        public void shouldBeUnderJurisdiction() {
            character2.isArrested(character);
            assertEquals(true, character2 );

        }
    }
