INSERT INTO products (description, image, name, price, quantity, catagory_id)
VALUES ('Most basic form of PokeBall used to catch pokemon',
        'https://archives.bulbagarden.net/media/upload/7/79/Dream_Pok%C3%A9_Ball_Sprite.png',
        'Poke-Ball', 200, 50, 1),
       ('Improved varient of regular PokeBall',
        'https://archives.bulbagarden.net/media/upload/b/bf/Dream_Great_Ball_Sprite.png',
        'Great-Ball', 600, 50, 1),
       ('Improved varient of Great-Ball used to catch pokemon',
        'https://archives.bulbagarden.net/media/upload/a/a8/Dream_Ultra_Ball_Sprite.png',
        'Ultra-Ball', 1200, 50, 1),
       ('Basic potion that Heals wounded Pokemon',
        'https://archives.bulbagarden.net/media/upload/d/df/Dream_Potion_Sprite.png',
        'Potion', 300, 50, 2),
       ('Improved potion from regular potion',
        'https://archives.bulbagarden.net/media/upload/5/57/Dream_Super_Potion_Sprite.png',
        'Super Potion', 700, 50, 2),
       ('Improved varient of regular potion',
        'https://archives.bulbagarden.net/media/upload/b/bf/Dream_Great_Ball_Sprite.png',
        'Super-Potion', 700, 50, 2),
       ('Improved varient of regular potion and super potion used to heal pokemon',
        'https://archives.bulbagarden.net/media/upload/c/c8/Dream_Hyper_Potion_Sprite.png',
        'Hyper-Potion', 1200, 50, 2),
       ('Revives fainted Pokemon',
        'https://archives.bulbagarden.net/media/upload/8/8c/Dream_Revive_Sprite.png',
        'Revive', 1500, 50, 4),
       ('Cures all Pokemon',
        'https://archives.bulbagarden.net/media/upload/4/42/Dream_Antidote_Sprite.png',
        'Antitode', 200, 50, 4),
       ('Cures all Pokemon',
        'https://archives.bulbagarden.net/media/upload/2/2a/Dream_Paralyze_Heal_Sprite.png',
        'Paralyze Heal', 300, 50, 4),
       ('Can be used to wake pokemon from sleep',
        'https://archives.bulbagarden.net/media/upload/7/7b/Dream_Awakening_Sprite.png',
        'Awakening', 250, 50, 4),
       ('Used to treat pokemon burns',
        'https://archives.bulbagarden.net/media/upload/f/f4/Dream_Burn_Heal_Sprite.png',
        'Burn Heal', 200, 40, 4),
       ('Used to thaw frozen pokemon',
        'https://archives.bulbagarden.net/media/upload/2/2a/Dream_Ice_Heal_Sprite.png',
        'Ice Heal', 150, 30, 4),
       ('Cures all effects on pokemon',
        'https://archives.bulbagarden.net/media/upload/0/07/Dream_Full_Heal_Sprite.png',
        'Full Heal', 400, 20, 4),
       ('Berry loved by all pokemon',
        'https://archives.bulbagarden.net/media/upload/0/07/Dream_Full_Heal_Sprite.png',
        'Berry', 5, 100, 3);



INSERT INTO catagories (catagory_name)
VALUES ('PokeBalls'),
    ('Potions'),
    ('Berries'),
    ('Antidotes');

