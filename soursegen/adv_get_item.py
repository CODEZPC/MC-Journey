name = input("Enter item:")
item = """
{
    "parent": "code:            ",
    "display": {
        "icon": {
            "count": 1,
            "id": "minecraft:%s"
        },
        "title": {
            "translate": "advanture.     %s"
        },
        "description": {
            "translate": "advanture.     %s.d"
        },
        "announce_to_chat": true,
        "show_toast": true,
        "frame": "task"
    },
    "criteria": {
        "get": {
            "trigger": "minecraft:inventory_changed",
            "conditions": {
                "items": [
                    {
                        "items": "minecraft:%s"
                    }
                ]
            }
        }
    },
    "requirements": [
        [
            "get"
        ]
    ]
}
""" % (name, name, name, name)
with open(f".\\output\\{name}.json", "w") as f:
    f.write(item)