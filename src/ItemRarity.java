public enum ItemRarity {
    COMMON {
        @Override
        String bonusText() { return "Hm, nothing special, eh?"; }
    },
    RARE {
        @Override
        double multiplier() { return 1.2; }
    },
    EPIC {
        @Override
        String bonusText() { return "WOW. Can't believe you found THIS!"; }
        @Override
        double multiplier() { return 2.0; }
    };

    double multiplier() { return 1.0; }
    String bonusText() { return "No bonus text..."; }
}
