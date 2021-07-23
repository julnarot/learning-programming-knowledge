package main

import (
	"fmt"
	"github.com/dghubble/go-twitter/twitter"
	"github.com/dghubble/oauth1"
	"log"
	"os"
)

type Credentials struct {
	ConsumerKey       string
	ConsumerSecret    string
	AccessToken       string
	AccessTokenSecret string
}

func Twitter(creds *Credentials) (*twitter.Client, error) {
	// show video https://www.youtube.com/watch?v=JF-BRYzNPdc
	config := oauth1.NewConfig("", "")
	token := oauth1.NewToken("", "")

	httpClient := config.Client(oauth1.NoContext, token)
	client := twitter.NewClient(httpClient)

	verifyParams := &twitter.AccountVerifyParams{
		SkipStatus:   twitter.Bool(true),
		IncludeEmail: twitter.Bool(true),
	}

	user, _, err := client.Accounts.VerifyCredentials(verifyParams)

	if err != nil {
		return nil, err

	}

	log.Printf("User Acccount \n%+v\n", user)
	return client, nil
}

func main() {
	fmt.Println("Twitter bot v1")

	//creds := Credentials{
	//	AccessToken:       os.Getenv("ACCESS_TOKEN"),
	//	AccessTokenSecret: os.Getenv("ACCESS_TOKEN_SECRET"),
	//	ConsumerKey:       os.Getenv("CONSUMER_KEY"),
	//	ConsumerSecret:    os.Getenv("CONSUMER_SECRET"),
	//}
	creds := Credentials{
		AccessToken:       "124560738-YcqDms8zvBuXnSKi5LrkcBFlx6f6DLyErmgrEIBS",
		AccessTokenSecret: "lUNg4mcsXzgeHJ0BuWqw047fbH2AAthSNouXhgce8soRo",
		ConsumerKey:       "DR1Pht3zV2VIf5jUKBrKvPpZE",
		ConsumerSecret:    "OfFgdgkrrjgdkLyf4Y1UvM51gvzGNbP7AhlJdvsXks7SSifPPY",
	}

	client, err := Twitter(&creds)
	fmt.Println("Twitter bot v1", creds, "jeej", client, " -> ", os.Getenv("ACCESS_TOKEN"))
	if err != nil {
		log.Println("Error in twitter Client")
		log.Println(err)
	}

	tweet, resp, err := client.Statuses.Update(" A new Test Tweet Bot 1.0", nil)

	if err != nil {
		log.Println(err)
	}

	log.Printf("%+v\n", resp)
	log.Printf("%+v\n", tweet)
}

// 124560738-GzhcZtmKrdb3opaCm6Hywex6hbwcsxJA8NIzqpke ACTOK
// dP0Fmwrs5vOiNRCJ92nuV4JIx9aDC87atVIqtsVckw4i7 acestokSecr
