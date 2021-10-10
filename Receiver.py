import pika, sys, os

def main():
	connection = pika.BlockingConnection(pika.ConnectionParameters('127.0.0.1'))
	channel = connection.channel()
	channel.queue_declare(queue='berita_queue')
	
	def callback(ch, method, properties, body):
		print("[v] received %r" % body)
		
	channel.basic_consume(queue='berita_queue', on_message_callback=callback, auto_ack=True)
	print(' [*] Waiting for messages. To exit press CTRL+C')
	channel.start_consuming()
	
if __name__ == '__main__':
	try:
		main()
	except KeyboardInterrupt:
		print('Interrupted')
	try:
		sys.exit(0)
	except SystemExit:
		os._exit(0)