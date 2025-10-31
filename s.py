from flask import Flask

app = Flask(__name__)

@app.route('/')
def greet():
    """Return a custom friendly HTTP greeting."""
    return " Hello World!"

if __name__ == "__main__":
    # Use a different port since 8080 is already taken
    app_host = "http://127.0.0.1:8081"
    print(f"App host link: {app_host}")
    app.run(host="127.0.0.1", port=8081, debug=True)
